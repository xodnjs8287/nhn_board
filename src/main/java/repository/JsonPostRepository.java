package repository;

import domain.PostJsonDataParser;
import domain.UserJsonDataParser;
import domain.Post;
import domain.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JsonPostRepository {

   private final PostJsonDataParser postJsonDataParser;

    private List<Post> postLoads;


    public JsonPostRepository(PostJsonDataParser postJsonDataParser) {
        this.postJsonDataParser = postJsonDataParser;
    }



    public List<Post> findCharge(int totalWaterUsage) {
        if (Objects.isNull(postLoads)) {
            throw new IllegalStateException("파일을 로드하지 않았습니다.");
        }

        List<Post> list = new ArrayList<>();
        for (Post post : postLoads) {
            list.add(post);
        }


        return list;

    }
}
