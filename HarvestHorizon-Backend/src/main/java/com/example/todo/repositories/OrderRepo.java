package com.example.todo.repositories;

import com.example.todo.model.Fertilizer;
import com.example.todo.model.OrderModel;
import com.example.todo.model.Pesticide;
import com.example.todo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<OrderModel,Integer> {
//    @Query("Select")
//    public List<OrderModel> getListOfOrderByCustomerId(@Param("id")Integer id);
//    @Query("Select ")
//    public UserModel getCustomerByOrderId(@Param("id") Integer id);
    //@Query("SELECT f FROM Fertilizer f WHERE f.order.id = :id")
    //public List<Fertilizer> getListOfFertilizersByOrderId(Integer id);
    //@Query("SELECT p FROM Pesticide p WHERE p.order.id = :id")
    //public List<Pesticide> getListOfPesticidesByOrderId(Integer id);
}
