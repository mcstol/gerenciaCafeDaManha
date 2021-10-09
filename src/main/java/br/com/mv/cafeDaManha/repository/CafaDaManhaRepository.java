package br.com.mv.cafeDaManha.repository;

import br.com.mv.cafeDaManha.model.CafeDaManha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Component
//public class CafaDaManhaRepository {
//    public List<CafeDaManha> findAll() {
//        List<CafeDaManha> listaDeCafes = new ArrayList<>();
//        listaDeCafes.add(new CafeDaManha(1,new Date()));
//        listaDeCafes.add(new CafeDaManha(2,new Date()));
//        return listaDeCafes;
//    };
//}
@Repository
public interface CafaDaManhaRepository  extends CrudRepository<CafeDaManha, Integer> {

}
