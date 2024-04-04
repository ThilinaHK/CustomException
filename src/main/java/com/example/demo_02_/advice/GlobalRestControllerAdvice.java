package com.example.demo_02_.advice;

import com.example.demo_02_.exceptions.EpicException;
import com.example.demo_02_.exceptions.EpicRunException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
@Order(0)
public class GlobalRestControllerAdvice {


//@ExceptionHandler(EpicException.class)
@ExceptionHandler({EpicException.class, EpicRunException.class})
    public ResponseEntity<?> epicException(Exception exception, HttpRequest httpRequest){
        if(exception instanceof EpicException){
            log.info("@@@@@@@@@@@@@@@@@@ "+httpRequest.getURI());
            return ResponseEntity.badRequest().body("Epic Exception "+exception.getMessage());
        }
        return ResponseEntity.badRequest().body("Epic Exception bad "+exception.getMessage());
    }

//    @ExceptionHandler({Exception.class})
//    public ResponseEntity<?> exceptionHandler(Exception exception){
//        if(exception instanceof EpicException){
//            return ResponseEntity.badRequest().body("exceptionHandler Exception "+exception.getClass().getName());
//        }
//        return ResponseEntity.badRequest().body("exceptionHandler Exception bad"+exception.getMessage());
//    }

}
