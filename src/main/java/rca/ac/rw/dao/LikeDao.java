package rca.ac.rw.dao;

import rca.ac.rw.orm.Like;

import java.util.List;

public interface LikeDao {
    public void saveLike(Like like);
    public void updateLike(Like like);
    public void deleteLike(int id);
    public List<Like> getLikes(int post_id);
}
