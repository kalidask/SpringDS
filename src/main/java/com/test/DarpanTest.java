package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="darpantest")
@Table(name="darpantest")
public class DarpanTest {

        @Id
        @Column(name="testid")
        private long testid;

        @Column(name="testname")
        private String testname;

    public DarpanTest() {
    }

        public long getTestid() {
                return testid;
        }

        public void setTestid(long testid) {
                this.testid = testid;
        }

        public String getTestname() {
                return testname;
        }

        public void setTestname(String testname) {
                this.testname = testname;
        }
} 