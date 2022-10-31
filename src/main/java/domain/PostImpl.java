package domain;

import repository.UserRepository;
import repository.UserRepositoryImpl;

import javax.servlet.ServletContext;
import java.time.LocalDateTime;

public class PostImpl implements Post{

    private  long id ;

    private String title;
    private String content;
    private String writerUserId;
    private LocalDateTime writeTime;

    public PostImpl() {
    }

    public PostImpl( long id , String title, String writerUserId, String content,LocalDateTime localDateTime) {
       this.id = getId();
        this.title = title;
        this.writerUserId = writerUserId;
        this.content = content;
        this.writeTime= getWriteTime();
    }


    @Override
    public  long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
             this.id = id;
    }

    @Override
    public String getTitle() {
      return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content= content;
    }

    @Override
    public String getWriterUserId() {

        return writerUserId;
    }

    @Override
    public void setWriterUserId(String writerUserId) {
            this.writerUserId =writerUserId;
    }

    @Override
    public LocalDateTime getWriteTime() {
       LocalDateTime now = LocalDateTime.now();
        return now;
    }

    @Override
    public void setWriteTime(LocalDateTime writeTime) {
            this.writeTime =writeTime;
    }

    @Override
    public int getViewCount() {
        return 0;
    }

    @Override
    public void increaseViewCount() {

    }
}
