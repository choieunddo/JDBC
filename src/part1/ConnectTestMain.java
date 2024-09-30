package part1;

//Transaction(TX): DB(프로그래밍)에서 분리할 수 없는 논리적인 작업 단위
//입금TX, 이체TX,  결재TX

import part1.common.JdbcUtil;

import java.sql.Connection;

//A계좌 에서 -1000  B계좌에서 update OK
//B계좌는 +1000   A계좌에서 update  ok
//commit
public class ConnectTestMain {
    public static void main(String[] args) {
        ConnectTest crud = new ConnectTest();
        crud.select();

    }
}




/*
package part1;

// Transaction(TX) : DB(프로그래밍)에서 분리할 수 없는 논리적인 작업 단위
// 입금 TX, 이체 TX, 결재 TX

// A계좌 에서 -1000원 B계좌에서 update OK
// B계좌는 +1000 A계좌에서 update fail
// rollback

// A계좌 에서 -1000원 B계좌에서 update OK
// B계좌는 +1000 A계좌에서 update OK
// commit


import part1.common.JdbcUtil;

import java.sql.Connection;

public class ConnectTestMain {
    public static void main(String[] args) {
        ConnectTest crud = new ConnectTest();
        //con= JdbcUtil.getConnection();
        crud.select();
        */
/*
        crud.connect();
        crud.txTest();
        System.out.println("------");
        //crud.login("aaa","1111");
        System.out.println("---------");
        crud.insert("eee","1111","이이",22,"여자");
      //  crud.update("aaa","2222","여자"); //aaa 회원의 비번과 성별을 변경
       // crud.select(); // 확인
        crud.delete("bbb"); // bbb회원 삭제*//*

        //crud.select();
        crud.close();
    }
}

*/

