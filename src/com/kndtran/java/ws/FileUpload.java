package com.kndtran.java.ws;

import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("upload")
public class FileUpload {
	
	@Context
	private ServletContext context;
	
	private final Logger logger = LoggerFactory.getLogger(FileUpload.class);
	private final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadFile(
			@FormDataParam("file") InputStream is,
			@FormDataParam("file") FormDataContentDisposition fileDetail
			) {
		
		String res = "";
		
		Message mes = new Message();
		
		try {
			mes.filename = fileDetail.getFileName();
		} catch (Exception e) {
			mes.error = "Error.";
			e.printStackTrace();
		}
		
		res = gson.toJson(mes);
		logger.info("JSON: {}", res);
		
		return Response
				.status(200)
				.entity(res)
				.build();
	}
}
