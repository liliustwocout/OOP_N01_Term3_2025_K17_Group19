# Group 9 — Dự án Game 2D

## Thành viên 👥
- **Lê Phạm Thành Đạt**(23010541)-ID: liliusgamer.
- **Bùi Hoài Anh**(23010294)-ID:bhanh92.
- **Đỗ Văn Duy**(23017211)-ID:dovanduy2005.
- **Nguyễn Lệ Thu**(Giảng viên)-ID:nglthu.
---
**I - Tiêu đề:**
Thiết kế và phát triển Game 2D:Hệ thống game "Lạc Trong Rừng Cấm".


**II - Đối tượng:** Phân tích 4 đối tượng bao gồm: account, player, enemy, game.

    1. Đối tượng tài khoản (account):

  1.1 Miêu tả thông tin của tài khoản:
  
 + Mã tài khoản (id).
 + Tên đăng nhập (username) - unique.
 + Mật khẩu (password).
 + Danh sách nhân vật thuộc về tài khoản.
   
  1.2 Phương thức hoạt động liên quan đến đối tượng tài khoản:
  
 + Đăng ký tài khoản mới.
 + Đăng nhập vào hệ thống.
 + Hiển thị thông tin tài khoản.
 + Quản lý danh sách nhân vật.


       2. Đối tượng nhân vật (player):

   
2.1 Miêu tả thông tin của nhân vật:

 + Mã nhân vật (id).
 + Tên nhân vật (name).
 + Cấp độ (level).
 + Avatar (hình ảnh nhân vật).
   
2.2 Phương thức hoạt động liên quan đến đối tượng nhân vật:

 + Tạo nhân vật mới.
 + Hiển thị thông tin nhân vật.
 + Cập nhật cấp độ nhân vật.
 + Chọn nhân vật để chơi game.

       3. Đối tượng quái vật (enemy):
   
3.1 Miêu tả thông tin của quái vật:

 + Mã quái vật (id).
 + Tên quái vật (name).
 + Cấp độ (level).
 + Sát thương (damage).
   
3.2 Phương thức hoạt động liên quan đến đối tượng quái vật:
   
 + Tạo quái vật mới.
 + Hiển thị thông tin quái vật.
 + Cập nhật thông số quái vật.
 + Sử dụng trong game logic.

       4. Đối tượng game:
   
4.1 Miêu tả thông tin của game:

 + Trạng thái game.
 + Nhân vật đang chơi.
 + Quái vật hiện tại.
 + Điểm số và tiến trình.
   
4.2 Phương thức hoạt động liên quan đến đối tượng game:

 + Khởi tạo game mới.
 + Chọn nhân vật.
 + Xử lý logic game.
 + Cập nhật trạng thái game.

   **III- Cấu trúc folder :**
        ### 📁 Cấu trúc thư mục Project

       plaintext
       springbootApp/complete/
       ├── src/
       │   ├── main/
       │   │   ├── java/
       │   │   │   └── com/example/servingwebcontent/
       │   │   │       ├── ServingWebContentApplication.java
       │   │   │       ├── AccountController.java
       │   │   │       ├── PlayerController.java
       │   │   │       ├── EnemyController.java
       │   │   │       ├── GameController.java
       │   │   │       ├── database/
       │   │   │       │   ├── aivenConnection.java
       │   │   │       │   └── AccountAiven.java
       │   │   │       └── model/
       │   │   │           ├── Account.java
       │   │   │           ├── Player.java
       │   │   │           ├── Enemy.java
       │   │   │           ├── AccountRepository.java
       │   │   │           ├── PlayerRepository.java
       │   │   │           └── EnemyRepository.java
       │   │   └── resources/
       │   │       ├── application.properties
       │   │       ├── static/
       │   │       │   ├── index.html
       │   │       │   └── avatars/
       │   │       │       ├── knight.png
       │   │       │       ├── mage.png
       │   │       │       └── archer.png
       │   │       └── templates/
       │   │           ├── login.html
       │   │           ├── register.html
       │   │           ├── accounts.html
       │   │           ├── players.html
       │   │           ├── enemies.html
       │   │           ├── choose-character.html
       │   │           ├── game.html
       │   │           └── error.html
       │   └── test/
       │       └── java/
       │           └── com/example/servingwebcontent/
       │               └── ServingWebContentApplicationTest.java
       ├── target/
       ├── pom.xml
       ├── build.gradle
       └── README.md
    **IV- Chức năng của từng đối tượng :**

Chúng em viết 15+ class cho 4 đối tượng xác định được ở câu 2 (bao gồm main và các class hỗ trợ). 
- Với đối tượng account ta có: class Account, AccountRepository, AccountController, AccountAiven.
- Với đối tượng player ta có: class Player, PlayerRepository, PlayerController  .
- Với đối tượng enemy ta có: class Enemy, EnemyRepository, EnemyController.
- Với đối tượng game ta có: class GameController, ServingWebContentApplication.
- Các class hỗ trợ: aivenConnection, các template HTML.

   **V- Kiểm nghiệm các chức năng của từng đối tượng :**

Để kiểm tra tính đúng đắn và ổn định của lớp Account, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:
  - Đăng ký tài khoản, đăng nhập, hiển thị thông tin tài khoản, quản lý danh sách nhân vật.

Để kiểm tra tính đúng đắn và ổn định của lớp Player, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:
  - Tạo nhân vật mới, hiển thị thông tin nhân vật, cập nhật cấp độ, chọn nhân vật để chơi game.

Để kiểm tra tính đúng đắn và ổn định của lớp Enemy, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:
  - Tạo quái vật mới, hiển thị thông tin quái vật, cập nhật thông số và sử dụng trong game logic.
    
Để kiểm tra tính đúng đắn và ổn định của lớp Game, chúng tôi thực hiện kiểm thử cho các chức năng chính sau:
  - Khởi tạo game, chọn nhân vật, xử lý logic game và cập nhật trạng thái game.

    **VI-Nội dung chính cho từng đối tượng  :**
    
        Xây dựng ứng dụng game web "Lạc Trong Rừng Cấm"

    Yêu cầu:
    
- Giao diện Java Spring Boot.
- Có chức năng quản lý tài khoản, nhân vật, quái vật và game logic.
- Và các chức năng khác.

  Cụ thể: 
- Có chức năng quản lý tài khoản (account):
  
  + Thêm, sửa, xóa tài khoản .
  + Liệt kê thông tin về tài khoản.
  + Đăng ký và đăng nhập hệ thống.
    
- Có chức năng quản lý nhân vật (player):
  
  + Thêm, sửa, xóa nhân vật.
  + Hiển thị thông tin nhân vật.
  + Cập nhật cấp độ nhân vật.
  + Chọn nhân vật để chơi game.

- Có chức năng quản lý quái vật (enemy):
  
  + Thêm, sửa, xóa quái vật.
  + Hiển thị thông tin quái vật.
  + Cập nhật thông số quái vật.
  + Sử dụng trong game logic.
  
- Có chức năng quản lý game:
  
  + Khởi tạo game mới.
  + Chọn nhân vật.
  + Xử lý logic game.
  + Cập nhật trạng thái game.

 - Dữ liệu được lưu trữ trong MySQL Database:
   
  + Cần tạo các bảng liên quan đến tài khoản, nhân vật, quái vật và game để lưu trữ dữ liệu.

 - Khi làm việc với dữ liệu trong bộ nhớ, dữ liệu cần được lưu trữ dưới dạng các Collection tùy chọn như ArrayList, LinkedList, Map, ... thông qua JPA Repository.
   ## Class Diagram :
   


       +---------------------+       +------------------------+        +----------------------+
       |       User          |<------>|       Account         |        |       Player         |
       +---------------------+       +------------------------+        +----------------------+
       | - userID            |       | - id: Long             |        | - id: Long           |
       | - name              |       | - username: String     |        | - name: String       |
       | - gender            |       | - password: String     |        | - level: int         |
       | - birthDate         |       | - players              |        | - avatar: String     |
       | - phoneNumber       |       +------------------------+        | - account: Account   |
       | - email             |                 |                       +----------------------+
       | - address           |                 ▼                                  │
       |                     |                                                    ▼ 
       | - password          |       +-------------------+           +----------------------+
       | - userType          |       |       Enemy       |           |      GameController  |
       +---------------------+       +-------------------+           +----------------------+
       | + getUser()         |       | - id: Long        |           | + startGame()        |
       | + getName()         |       | - name: String    |           | + saveGame()         |
       | + getGender()       |       | - level: int      |           | + loadGame()         |
       | + getBirthDate()    |       | - damage: int     |           | + updateGameStatus() |
       | + getEmail()        |       +-------------------+           +----------------------+
       | + getPhoneNumber()  |             |
       | + getAddress()      |             ▼
       | + getPassword()     |       +-------------------+         +------------------------+
       | + getUserType()     |       |  EnemyRepository  |        |   AccountController     |
       | + setUser()         |       +-------------------+         +------------------------+
       | + login()           |       | + findAll()       |        | + login()               |
       | + showUser()        |       | + findById()      |        | + register()            |
       +---------------------+       | + save()          |        | + listAccounts()        |
                                     | + delete()        |        | + addAccount()          |
                                     +-------------------+        | + editAccount()         |
                                                                  | + deleteAccount()       |
                                                                  +-------------------------+


     ## ACTIVITY DIAGRAM - ĐĂNG NHẬP:
   
       ┌──────────────────────────────┐
       │           Start              │
       └─────────────┬────────────────┘
                     │
                     ▼
       ┌──────────────────────────────┐
       │   Nhập username, password    │
       └─────────────┬────────────────┘
                     │
                     ▼
       ┌───────────────────────────────┐
       │   Kiểm tra thông tin hợp lệ?  │
       └───────┬─────────────┬─────────┘
               │             │
          Không│             │Có
               ▼             ▼
       ┌────────────────┐  ┌───────────────────────────────┐
       │  Thông báo lỗi │  │      Đăng nhập thành công     │
       └───────┬────────┘  └─────────────┬─────────────────┘
               │                         │
               └─────────────┬───────────┘
                             ▼
                       ┌───────────┐
                       │    End    │
                       └───────────┘


    ## ACTIVITY DIAGRAM - CHỌN NHÂN VẬT:

       ┌──────────────────────────────┐
       │            Start             │
       └─────────────┬────────────────┘
                     │
                     ▼
       ┌──────────────────────────────┐
       │  Hiển thị danh sách nhân vật │
       └─────────────┬────────────────┘
                     │
                     ▼
       ┌──────────────────────────────┐
       │   Người dùng chọn nhân vật   │
       └─────────────┬────────────────┘
                     │
                     ▼
       ┌──────────────────────────────┐
       │   Lưu lựa chọn & chuyển game │
       └─────────────┬────────────────┘
                     │
                     ▼
               ┌──────────┐
               │    End   │
               └──────────┘


   ## ACTIVITY DIAGRAM - QUẢN LÝ NHÂN VẬT:


        ┌─────────────────────────────┐
        │           Start             │
        └─────────────┬───────────────┘
                      │
                      ▼
        ┌──────────────────────────────┐
        │  Hiển thị danh sách nhân vật │
        └─────────────┬────────────────┘
                      │
                      ▼
        ┌───────────────────────────────┐
        │   [Thêm/Sửa/Xóa] nhân vật?    │
        └───────┬─────────────┬─────────┘
                │             │
           Thêm │        Sửa/Xóa
                ▼             ▼
        ┌────────────────┐  ┌──────────────────────────────┐
        │  Nhập thông tin│  │   Chọn nhân vật cần sửa/xóa  │
        │  nhân vật mới  │  └─────────────┬────────────────┘
        └───────┬────────┘                │
                │                         ▼
                └─────────────┬───────────┘
                              ▼
                        ┌───────────────┐
                        │  Cập nhật DB  │
                        └───────────────┘
                              │
                              ▼
                        ┌───────────────┐
                        │    End        │
                        └───────────────┘



   🎯 Hướng dẫn sử dụng:
   
 1. Đăng ký tài khoản:

 -Truy cập trang chủ.
 
 -Nhấn "Đăng Ký".
 
 -Nhập username và password.
 
 -Nhấn "Đăng Ký" để tạo tài khoản mới.

 2. Đăng nhập:
    
 -Từ trang chủ, nhấn "Đăng Nhập".
 
 -Nhập username và password đã đăng ký.
 
 -Nhấn "Đăng Nhập" để vào hệ thống.

 3. Chọn nhân vật:
    
 -Sau khi đăng nhập, hệ thống hiển thị danh sách nhân vật.
 
 -Chọn nhân vật để bắt đầu chơi game.

  4. Quản lý dữ liệu:
     
 -Quản lý tài khoản: /accounts.
 
 -Quản lý nhân vật: /players.
 
 -Quản lý quái vật: /enemies.

 🛠️ API Endpoints

   Account Management:
 
 -GET /accounts - Danh sách tài khoản.
 
 -GET /accounts/add - Form thêm tài khoản.
 
 -POST /accounts/add - Thêm tài khoản.
 
 -GET /accounts/edit/{id} - Form sửa tài khoản.
 
 -POST /accounts/edit/{id} - Sửa tài khoản.
 
 -GET /accounts/delete/{id} - Xóa tài khoản.

   Player Management:
   
- GET /players - Danh sách nhân vật.
  
 -GET /players/add - Form thêm nhân vật.
 
 -POST /players/add - Thêm nhân vật.
 
 -GET /players/edit/{id} - Form sửa nhân vật. 
 
 -POST /players/edit/{id} - Sửa nhân vật.
 
 -GET /players/delete/{id} - Xóa nhân vật.

   Enemy Management:
  
 -GET /enemies - Danh sách quái vật.
 
 -GET /enemies/add - Form thêm quái vật.
 
 -POST /enemies/add - Thêm quái vật.
 
 -GET /enemies/edit/{id} - Form sửa quái vật.
 
 -POST /enemies/edit/{id} - Sửa quái vật.
 
 -GET /enemies/delete/{id} - Xóa quái vật.

 🗄️ Cấu trúc Database:
 
 Bảng accounts:
 
 -id (Primary Key).
 
 -username (Unique, Not Null).
 
 -password (Not Null).
 
 -Bảng players.
 
 -id (Primary Key).
 
 -name (Not Null).
 
 -level (Integer).
 
 -avatar (String).
 
 -account_id (Foreign Key to accounts).

 Bảng enemies:
 
 -id (Primary Key).
 
 -name (Not Null).
 
 -level (Integer).
 
 -damage (Integer).

 🚀 Tính năng nâng cao
 
   *Đã triển khai:
   
✅ Hệ thống đăng ký/đăng nhập.

✅ Quản lý CRUD cho tài khoản, nhân vật, quái vật.

✅ Giao diện responsive.

✅ Kết nối database cloud (Aiven).

✅ Hệ thống avatar nhân vật.

  *Có thể phát triển thêm:

🔄 Hệ thống inventory (túi đồ). 

🔄 Hệ thống quest (nhiệm vụ). 

🔄 Hệ thống leveling (lên cấp).

🔄 Multiplayer support.

🔄 Real-time chat.

🔄 Leaderboard.



 ## Phân công công việc:

| Thành viên |              Nhiệm vụ              |
|------------|------------------------------------|
|   Đạt      | Quản lý tài khoản và game logic    | 
|   Hoài Anh | Quản lý nhân vật và chọn nhân vật  |
|   Duy      | Quản lý quái vật và đăng nhập      |


                                                           

  

   


   

   





 




  

