package com.example.Library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="books")
public class BooksEntity {

    @NotNull
    @Id
    private Integer id;

    @NotBlank(message="field cannot be empty")
    private String name,writer,summary,category;

    public BooksEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BooksEntity(@NotNull Integer id, @NotBlank(message = "field cannot be empty") String name, @NotBlank(message = "field cannot be empty") String writer, @NotBlank(message = "field cannot be empty") String summary, @NotBlank(message = "field cannot be empty") String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }
}
