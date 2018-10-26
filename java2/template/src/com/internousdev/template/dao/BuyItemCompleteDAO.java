package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class BuyItemCompleteDAO{

  private DateUtil dateUtil=new DateUtil();

  private String sql="INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";

  public void buyItemInfo(String item_transaction_id,String user_master_id,
  String total_price,String total_count,String pay)throws SQLException{
    DBConnector dbConnector=new DBConnector();
    Connection connection=dbConnector.getConnection();

    try{
        PreparedStatement prepareStatement=connection.prepareStatement(sql);
            prepareStatement.setString(1,item_transaction_id);
            prepareStatement.setString(2,total_price);
            prepareStatement.setString(3,total_count);
            prepareStatement.setString(4,user_master_id);
            prepareStatement.setString(5,pay);
            prepareStatement.setString(6,dateUtil.getDate());

            prepareStatement.execute();

        }catch(Exception e){
          e.printStackTrace();
        }finally{
          connection.close();
        }
      }
    }
