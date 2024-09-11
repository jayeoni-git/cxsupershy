package com.project.cxsupershy.controller.receiver;

import com.project.cxsupershy.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Map;

@RestController
public class JsonReceiverController {
    @Autowired
    FileService fileService;

//    @PostMapping("/receive-json")
//    public ResponseEntity<String> receiveJsonData(@RequestParam(name="json") String jsonString) {
//
//        String rs = fileService.jsonToString(jsonString);
//        System.out.println(rs);
//
////        // embeddings와 log_data를 받아서 처리합니다.
////        Map<String, Object> embeddings = (Map<String, Object>) data.get("embeddings");
////        Map<String, Object> logData = (Map<String, Object>) data.get("log_data");
////
////        // 데이터 처리 (필요한 로직 추가)
////        System.out.println("Received embeddings: " + embeddings);
////        System.out.println("Received log_data: " + logData);
//
//        // 이후 다음 페이지로 이동 로직을 처리할 수 있습니다.
//        return ResponseEntity.ok("데이터 수신 완료");
//    }

    @PostMapping("/receive-json")
    public ResponseEntity<String> receiveData(@RequestBody Map<String, Object> data) {
        // JSON 데이터에서 embeddings와 log_data를 추출
        Object embeddings = data.get("embeddings");
        Object logData = data.get("log_data");

        // 데이터를 콘솔에 출력
        System.out.println("Received embeddings: " + embeddings);
        System.out.println("Received log_data: " + logData);

        // 받은 데이터를 처리하는 로직을 여기에 추가할 수 있습니다.
        // 예: 데이터베이스에 저장, 파일로 저장 등

        // 성공적인 응답 반환
        return ResponseEntity.ok("데이터를 성공적으로 받았습니다.");
    }
}