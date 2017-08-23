package com.example.rlphotomobileapp.Todo;

/**
 * Created by BeckLyons on 28/01/2017.
 */
public class PhotoItem {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("image")
    private String image;

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("thumbnail")
    private String thumbnail;


    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("coordinates")
    private String coordinates;


    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;


    /**
     * ToDoItem constructor
     */
    public PhotoItem() {

    }

    @Override
    public String toString() {
        return getImage().toString();
    }

    /**
     * Initializes a new ToDoItem
     * @param id
     * @param image
     *            The item text
     * @param thumbnail
     * @param coordinates
     */
    public PhotoItem(String id, String image, String thumbnail, String coordinates) {
        this.image = image;
        this.thumbnail = thumbnail;
        this.coordinates = coordinates;
        this.setId(id);
    }


    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }



    @Override
    public boolean equals(Object o) {
        return o instanceof PhotoItem && ((PhotoItem) o).mId == mId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}