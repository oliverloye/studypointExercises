/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Oliver
 */
public class Quote {
    
    private int newId;
    private String quote;

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Quote(int newId, String quote) {
        this.newId = newId;
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Quote{" + "newId=" + newId + ", quote=" + quote + '}';
    }
    
}
