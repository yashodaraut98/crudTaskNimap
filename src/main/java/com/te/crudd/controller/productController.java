package com.te.crudd.controller;

import java.util.List;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.crudd.dto.Product;
import com.te.crudd.servicee.ProductService;

@RestController
@RequestMapping(value="/api/prod")
public class productController {
private ProductService s;

public productController(ProductService s) {
	super();
	this.s = s;
}

//build create product rest apis
@PostMapping("/in")
public ResponseEntity<Product>saveprod(@RequestBody Product prod){
	return new ResponseEntity<Product>(s.save(prod),HttpStatus.OK);
	
}

//build get all Product Rest Api
@GetMapping("/get")
public List<Product>getprodAll(){
	return s.getProd();
	
}

//build update Product in Rest Api
@PutMapping("{p_id}")
public ResponseEntity<Product> updProd(@PathVariable("p_id") int p_id,@RequestBody Product prod){
	return new ResponseEntity<Product> (s.updateProd(prod, p_id),HttpStatus.OK);
	

}

//Build delete Product rest Api
@DeleteMapping("{p_id}")
public ResponseEntity<String>deletingProd(@PathVariable("p_id") int p_id){
	s.deleteProd(p_id);
	return new ResponseEntity<String>("Product deleted successfully!!!!!!!!!!!!",HttpStatus.OK);
	


}



}
