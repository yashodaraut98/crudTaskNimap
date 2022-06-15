package com.te.crud.service;

import java.util.List;


import com.te.crud.dto.Categories;

public interface Servicee {
Categories save(Categories cat);
List<Categories> getCatg();
Categories getById(int c_id);
Categories updateCatg(Categories catg, int c_id);
void deleteCatg(int c_id);



}
