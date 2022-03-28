package com.chm.exam1.Article.controller;

import com.chm.exam1.Article.dao.ArticleRepository;
import com.chm.exam1.Article.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("usr/article")
public class ArticleController {
	@Autowired
	private ArticleRepository articleRepository;

	@RequestMapping("list")
	public List<Article> showList(){
		return articleRepository.findAll();
	}
}
