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

}
