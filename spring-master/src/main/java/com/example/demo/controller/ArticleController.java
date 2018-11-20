package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dao.ArticleDao;
import com.example.demo.model.Article;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleDao ArticleDao;


        public ArticleDao getArticleDao() {
		return ArticleDao;
	}

	public void setArticleDao(ArticleDao ArticleDao) {
		this.ArticleDao = ArticleDao;
	}

		@RequestMapping("/article")
        public List<Article> getAllarticles(){
           return ArticleDao.getArticle();
        }

        @RequestMapping("/article/{id}")
        public Article getarticleById(@PathVariable int id){
            return ArticleDao.getArticle(id);
        }

        @RequestMapping(method = RequestMethod.POST,value="/article")
        public void addarticle(@RequestBody Article player){
        	ArticleDao.addArticle(player);
        }
        @RequestMapping(method = RequestMethod.PUT,value="/article/{id}")
            public void editarticle(@RequestBody Article player,@PathVariable int id){
        	ArticleDao.editArticle(player, id);
            }
    @RequestMapping(method = RequestMethod.DELETE,value="/article/{id}")
    public void deletearticle(@PathVariable int id){
    	ArticleDao.deleteArticle(id);
    }
}