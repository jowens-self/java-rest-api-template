Dropzone.autoDiscover = false;

$(document).ready(function(e) {
	var myDropzone = new Dropzone("#dropzone-form");
	myDropzone.on("addedfile", function(file) {
		console.log("Added file: " + file.name);
	});
	
	myDropzone.on("success", function(file, response) {
		console.log(file);
		console.log(response);
		$("#messages").append("<p>"+response.filename+"</p>");
	});
});
