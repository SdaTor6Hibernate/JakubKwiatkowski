package dao;

import model.Address;

public class MainGeneric {
    public static void main(String[] args) {
        GenericDao<Address> addressGenericDao = new GenericDao<>(Address.class);
        System.out.println(addressGenericDao.selectById(2).toString());
    }
}
