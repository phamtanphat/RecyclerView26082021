package com.example.recyclerview26082021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    private int image;
    private String name;
    private String address;
    private Category category;
    private Float distance;
    private Float rating;

    public Food(int image, String name, String address, Category category, Float distance, Float rating) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.category = category;
        this.distance = distance;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public static List<Food> getFoodMock() {
        return new ArrayList<>(Arrays.asList(
                new Food(R.drawable.hinh_quan_bun_di_van,"Quán Bún Dì Vân","66/32 Trần Văn Quang, P. 10, Tân Bình, TP. HCM",Category.BISTRO,100f,4.5f),
                new Food(R.drawable.hinh_rules_of_tea,"Rules Of Tea - Trà Sữa Đế Vương - Nguyễn Văn Cừ","213D Nguyễn Văn Cừ, P. 3, Quận 5, TP. HCM",Category.BISTRO,5f,4.2f),
                new Food(R.drawable.hinh_bep_ba_muoi,"Bếp Bà Muối - Ăn Vặt Online","606/52 Đường 3 Tháng 2, P. 14, Quận 10, TP. HCM",Category.SHOP_ONLINE,2f,0f),
                new Food(R.drawable.hinh_tam_ky2,"Tâm Ký II - Cơm Chiên & Nui Xào - Lương Định Của","Hẻm 281A Lương Định Của, P. An Phú, Quận 2, TP. HCM",Category.BISTRO,5f,4.3f),
                new Food(R.drawable.hinh_meimei_che_quan,"Meimei Chè Quán - Chè Khoai Dẻo Thảo Mộc","141/1 Tôn Đản, P. 14, Quận 4, TP. HCM",Category.BISTRO,3f,5f),
                new Food(R.drawable.hinh_crab_restaurant,"Crab Restaurant - Chuyên Các Món Cua","Tầng 2, Tầng 2, 304 Tôn Thất Hiệp, P. 12, Quận 11, TP. HCM",Category.BISTRO,3f,5f),
                new Food(R.drawable.hinh_chi_pheo,"Chí Phèo - Cơm Tôm Đồng Rang Tóp Mỡ","436/41/6 Cách Mạng Tháng 8, P. 11, Quận 3, TP. HCM",Category.BISTRO,2f,4.1f),
                new Food(R.drawable.hinh_ta_la_an_vat,"Tá Lả - Ăn Vặt, Mì Xào, Cơm Chiên & Sinh Tố - Phan Văn Trị","497/2 Phan Văn Trị, P. 5, Gò Vấp, TP. HCM",Category.BISTRO,15.5f,4.5f),
                new Food(R.drawable.hinh_anh_quan,"Anh Quán - Mì Khô Gà Quay & Hủ Tiếu Mì Sủi Cảo","80/17/138 Dương Quảng Hàm, P. 5, Gò Vấp, TP. HCM",Category.BISTRO,4f,5f),
                new Food(R.drawable.hinh_uncle_tea,"Uncle Tea - Trà Đài Loan - Hùng Vương","162 Hùng Vương, P. 2, Quận 10, TP. HCM",Category.BISTRO,4.1f,5f)
        ));
    }
}
