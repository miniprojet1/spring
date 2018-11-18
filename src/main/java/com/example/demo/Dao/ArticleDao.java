package com.example.demo.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Article;
import com.example.demo.model.Commissioner;
import com.example.demo.repository.ArticleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleDao {

    @Autowired
    private ArticleRepository articleRepository;



    public List<Article> getArticle() {
        List<Article> lp=new ArrayList<>();
        articleRepository.findAll()
                .forEach(lp::add);
        return lp;
    }

    public Article getArticle(int id){
       
        return articleRepository.findById(id).get();

    }

    public void addArticle(Article player){
    	articleRepository.save(player);
    }

    public void editArticle(Article player, int id) {

    	articleRepository.save(player);
    }

    public void deleteArticle(int id) {

    	articleRepository.deleteById(id);
    }
}	