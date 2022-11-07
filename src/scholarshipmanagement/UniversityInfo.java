/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholarshipmanagement;

/**
 *
 * @author HP
 */
public class UniversityInfo {
    
    private int UniID;
    private float UniRating;
    private String UniName,Location;

    public UniversityInfo(int UniID, float UniRating, String UniName, String Location) {
        this.UniID = UniID;
        this.UniRating = UniRating;
        this.UniName = UniName;
        this.Location = Location;
    }

    public UniversityInfo() {
        ;
    }

    public int getUniID() {
        return UniID;
    }

    public void setUniID(int UniID) {
        this.UniID = UniID;
    }

    public float getUniRating() {
        return UniRating;
    }

    public void setUniRating(float UniRating) {
        this.UniRating = UniRating;
    }

    public String getUniName() {
        return UniName;
    }

    public void setUniName(String UniName) {
        this.UniName = UniName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    
    
    
}
