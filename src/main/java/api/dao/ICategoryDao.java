package api.dao;

import java.util.List;

import api.domain.Category;

public interface ICategoryDao {

	List<Category> getAll();

}