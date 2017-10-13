package org.hibernate.poc.entity;

import javax.persistence.Embeddable;
import java.net.URL;

public class Contact {

    private Name name;

    private String notes;

    private URL website;

    private boolean starred;


    @Embeddable
    class Name {
        private String first_name;

        private String middle_name;

        private String last_name;

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getMiddle_name() {
            return middle_name;
        }

        public void setMiddle_name(String middle_name) {
            this.middle_name = middle_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }
    }
}
