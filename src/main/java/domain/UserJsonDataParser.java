package domain;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserJsonDataParser {


    private final ObjectMapper objectMapper = new ObjectMapper();


    public List<User> parse(String filePath) {

        if (!filePath.endsWith(".json")) {
            throw new IllegalArgumentException("json 파일만 읽을 수 있습니다.");
        }
        try {
            return List.of(objectMapper.readValue(new File(filePath), User[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
