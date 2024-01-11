package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라.

    public void addItem(Item item) {
        if (!isCountValid()) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            // amount += item.getTotalPrice();
        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    /**
     * 내부에서만 사용하기에 private
     * displayItems 메서드 안에서 계산하지말고 메서드로 빼서 사용하는게 유지보수에 좋다
     * @return
     */
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
    }

    public boolean isCountValid() {
        return itemCount < items.length;
    }

}
