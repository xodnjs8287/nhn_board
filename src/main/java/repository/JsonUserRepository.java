package repository;

import domain.UserJsonDataParser;
import domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsonUserRepository {

    private final UserJsonDataParser userJsonDataParser;

    private List<User> userLoads;


    public JsonUserRepository(UserJsonDataParser userJsonDataParser) {
        this.userJsonDataParser = userJsonDataParser;
    }

    public void load(String filePath){
        this.userLoads = userJsonDataParser.parse(filePath);
    }


    public List<User> findCharge(int totalWaterUsage) {
        if (Objects.isNull(userLoads)) {
            throw new IllegalStateException("파일을 로드하지 않았습니다.");
        }

        List<User> list = new ArrayList<>();
        for (User user : userLoads) {
           list.add(user);
        }


        return list;

    }


}
