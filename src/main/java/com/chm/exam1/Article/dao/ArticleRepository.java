package com.chm.exam1.Article.dao;

import com.chm.exam1.Article.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
