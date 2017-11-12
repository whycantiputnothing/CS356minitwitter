/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public interface Subject {
    
    /**
     *
     * @param observer Observer to attach to list of observers
     */
    void Attach(Observer observer);

    /**
     *  notifies all observers of a change
     */
    void NotifyObservers();
}
