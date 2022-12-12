/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09muonlaxinamoniquejhoienyl;

/**
 *
 * @author MUON
 */
public class FullTeamException extends Exception {
    /**
     * Creates a new instance of <code>MonsterNotFoundException</code> without
     * detail message.
     */
    public FullTeamException() {
    }

    /**
     * Constructs an instance of <code>MonsterNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FullTeamException(String msg) {
        super(msg);
    }
}
