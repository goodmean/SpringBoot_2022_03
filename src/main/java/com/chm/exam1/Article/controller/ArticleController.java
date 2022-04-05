package com.chm.exam1.Article.controller;

import com.chm.exam1.Article.dao.ArticleRepository;
import com.chm.exam1.Article.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("usr/article")
public class ArticleController {
	@Autowired
	private ArticleRepository articleRepository;

	@RequestMapping("list")
	public List<Article> showList(){
		return articleRepository.findAll();
	}

	@RequestMapping("detail")
	@ResponseBody
	// EX : http://localhost:8082/usr/article/detail?id=2 => id 매개변수에 2L 이 들어옵니다.
	public Article showDetail(long id) {
		Optional<Article> article = articleRepository.findById(id);
		return article.get();
	}

	@RequestMapping("doModify")
	@ResponseBody
	public Article showModify(long id, String title, String body) {
		Article article = articleRepository.findById(id).get();

		if ( title != null ) {
			article.setTitle(title);
		}

		if ( body != null ) {
			article.setBody(body);
		}

		articleRepository.save(article);

		return article;
	}
}
