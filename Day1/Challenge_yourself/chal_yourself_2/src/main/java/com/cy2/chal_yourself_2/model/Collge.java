package com.cy2.chal_yourself_2.model;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Collge 
{
         private String cname;
         private String dept;
         private int sec;
        public String getCname() {
            return cname;
        }
        public void setCname(String cname) {
            this.cname = cname;
        }
        public String getDept() {
            return dept;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }
        public int getSec() {
            return sec;
        }
        public void setSec(int sec) {
            this.sec = sec;
        }
         
}
