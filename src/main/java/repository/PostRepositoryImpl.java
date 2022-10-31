package repository;

import domain.Post;
import domain.User;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository{

    List<Post> postList = new ArrayList<>();

    @Override
    public void register(Post post) {
        this.postList.add(post);
    }

    @Override
    public void modify(Post post) {

    }

    @Override
    public Post remove(long id) {
        for (Post post : postList) {
            if(post.getId()==id){
                postList.remove(post);
            }
        }
        return null;
    }

    @Override
    public Post getPost(String title) {
        for (Post post : postList) {
            if (post.getTitle().equals(title)) {
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> getPosts() {
        return postList;
    }
}
