package repository;

import domain.Post;

import java.util.List;

public interface PostRepository {
    void register(Post post); //add
    void modify(Post post);
    Post remove(long id);

    Post getPost(String title);
    List<Post> getPosts();


}
