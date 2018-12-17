package com.globant.vividseats.rest;

import com.globant.vividseats.exception.DataFormatException;
import org.springframework.http.HttpEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface FindCelebrityRest {

    HttpEntity findCelebrityProcess(MultipartFile file) throws IOException, DataFormatException;

    HttpEntity getResultProcess(Long idProcess);
}
