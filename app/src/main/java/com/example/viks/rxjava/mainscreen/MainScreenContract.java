package com.example.viks.rxjava.mainscreen;

import com.example.viks.rxjava.data.Post;

import java.util.List;

/**
 * Created by viks on 12/8/16.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
    }
}
