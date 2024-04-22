/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.socialmedia;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<Post> posts;

    public User(String userName) {
        this.userName = userName;
        this.posts = new ArrayList<>();
    }
    public String getUsername() {
        return userName;
    }

    public void createPost(String content) {
        Post post = new Post(content);
        posts.add(post);
    }

    public void sharePost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }
}
