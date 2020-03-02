package com.example.bookitup;

public class UserInformation {

        private String fname;
        private String lname;
        private String uni;
        private String major;
        private String email;

        public UserInformation(String fname, String lname, String uni, String major) {
            this.fname = fname;
            this.lname = lname;
            this.uni = uni;
            this.major = major;
            //this.email = email;
        }

        //fname
        public String getfname() {
            return fname + " " + lname;
        }

        public void setfname(String fname) {
            this.fname = fname;
        }

        //lname
        public String getlName() {
            return lname;
        }

        public void setlname(String lname ) {
            this.fname = lname;
        }

        //university
        public String getUni() {
            return uni;
        }
        public void setUni(String uni) {
            this.uni = uni;
        }

        //major
        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        //email
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}

