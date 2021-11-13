package com.springed.demopackage.cdi;

import javax.inject.Inject;
import javax.inject.Named;

// @Component
@Named
public class CDIImp {

    // @Autowired
    @Inject
    private CDIDao cdiDao;

    public CDIDao getCdiDao() {
        return cdiDao;
    }

    public void setCdiDao(CDIDao cdiDao) {
        this.cdiDao = cdiDao;
    }

    public int findGreatest() {
        // int greatest = Integer.MAX_VALUE;
        // int data = 10;
        int data = cdiDao.getData();
        // for (int value : data) {
        // if (value > greatest) {
        // greatest = value;
        // }
        // }
        return data;
    }

}
