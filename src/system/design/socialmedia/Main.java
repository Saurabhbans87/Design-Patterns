/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.socialmedia;

public class Main {
    public static void main(String[] args) {
        // Create some users
        User user1 = new User("user1");
        User user2 = new User("user2");

        // User1 creates a post
        user1.createPost("Hello world!");

        // User2 shares User1's post
        Post sharedPost = user1.getPosts().get(0);
        user2.sharePost(sharedPost);

        // Display User1's posts
        System.out.println("Posts by " + user1.getUsername() + ":");
        for (Post post : user1.getPosts()) {
            System.out.println(post.getContent());
        }

        // Display User2's posts
        System.out.println("Posts by " + user2.getUsername() + ":");
        for (Post post : user2.getPosts()) {
            System.out.println(post.getContent());
        }
    }
}
