package life.found.community.mapper;

import life.found.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}