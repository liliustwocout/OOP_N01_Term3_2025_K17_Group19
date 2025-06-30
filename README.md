![Screenshot 2025-07-01 003737](https://github.com/user-attachments/assets/0c8d2855-8c25-4c05-91de-dcec8c00704d)# Group 19 — Dự án Game 2D OOP

## Thành viên 👥
- **Lê Phạm Thành Đạt** (23010541) - ID: liliusgamer.
- **Bùi Hoài Anh** (23010294) - ID: bhanh92.  
- **Đỗ Văn Duy** (23017211) - ID: dovanduy2005.
- **Nguyễn Lệ Thu** (Giảng viên) - ID: nglthu.

---

## I - Tiêu đề.
Thiết kế và phát triển Game 2D: Hệ thống game "Lạc Trong Rừng Cấm" sử dụng Java OOP và Spring Boot.

## II - Đối tượng.
Phân tích 4 đối tượng chính bao gồm: Account, Player, Enemy, Game.

### 1. Đối tượng tài khoản (Account).

#### 1.1 Miêu tả thông tin của tài khoản:
- Mã tài khoản (id).
- Tên đăng nhập (username) - unique.
- Email (email).
- Danh sách nhân vật thuộc về tài khoản.

#### 1.2 Phương thức hoạt động liên quan đến đối tượng tài khoản:
- Đăng ký tài khoản mới.
- Đăng nhập vào hệ thống.
- Hiển thị thông tin tài khoản.
- Quản lý danh sách nhân vật.

### 2. Đối tượng nhân vật (Player).

#### 2.1 Miêu tả thông tin của nhân vật:
- Mã nhân vật (id).
- Tên nhân vật (name)
- Cấp độ (level)
- HP hiện tại và tối đa (hp, maxHp)
- Sát thương (attack)
- Phòng thủ (defense)
- Trạng thái sống/chết (isAlive)

#### 2.2 Phương thức hoạt động liên quan đến đối tượng nhân vật:
- Tạo nhân vật mới.
- Hiển thị thông tin nhân vật.
- Tấn công quái vật.
- Nhận sát thương.
- Hồi máu.
- Lên cấp.
- Hiển thị nhân vật cấp cao.

### 3. Đối tượng quái vật (Enemy).

#### 3.1 Miêu tả thông tin của quái vật:
- Mã quái vật (id).
- Tên quái vật (name).
- Cấp độ (level).
- HP hiện tại và tối đa (hp, maxHp).
- Sát thương (attack).
- Phòng thủ (defense).
- Trạng thái sống/chết (isAlive).

#### 3.2 Phương thức hoạt động liên quan đến đối tượng quái vật:
- Tạo quái vật mới.
- Hiển thị thông tin quái vật.
- Tấn công người chơi.
- Nhận sát thương.
- Cập nhật thông số quái vật.

### 4. Đối tượng game.

#### 4.1 Miêu tả thông tin của game:
- Trạng thái game.
- Nhân vật đang chơi.
- Quái vật hiện tại.
- Điểm số và tiến trình.

#### 4.2 Phương thức hoạt động liên quan đến đối tượng game:
- Khởi tạo game mới.
- Chọn nhân vật.
- Xử lý logic game.
- Cập nhật trạng thái game.

## III - Cấu trúc folder.

### 📁 Cấu trúc thư mục Project.

```
OOP_N01_Term3_2025_K17_Group19-main/
├── src/
│   ├── main/
│   │   └── controller/
│   │       └── PlayerController.java
│   ├── object/
│   │   ├── Account.java
│   │   ├── AccountList.java
│   │   ├── Player.java
│   │   ├── PlayerList.java
│   │   ├── Enemy.java
│   │   ├── EnemyList.java
│   │   └── HienThiTaiKhoan.java
│   ├── general/
│   │   ├── ObjectGeneral.java
│   │   ├── ObjectList.java
│   │   └── TestObjectList.java
│   ├── test/
│   │   ├── testAccount.java
│   │   ├── testAccountList.java
│   │   ├── testPlayer.java
│   │   ├── testEnemy.java
│   │   ├── testAttack.java
│   │   └── testCombat.java
│   └── Main.java
├── springBoot-main/
│   └── gs-serving-web-content-main/
│       ├── complete/
│       │   ├── src/
│       │   │   ├── main/
│       │   │   │   ├── java/
│       │   │   │   │   └── com/example/servingwebcontent/
│       │   │   │   │       ├── ServingWebContentApplication.java
│       │   │   │   │       ├── AccountController.java
│       │   │   │   │       ├── PlayerController.java
│       │   │   │   │       ├── EnemyController.java
│       │   │   │   │       ├── GameController.java
│       │   │   │   │       ├── database/
│       │   │   │   │       │   ├── aivenConnection.java
│       │   │   │   │       │   └── AccountAiven.java
│       │   │   │   │       └── model/
│       │   │   │   │           ├── Account.java
│       │   │   │   │           ├── Player.java
│       │   │   │   │           ├── Enemy.java
│       │   │   │   │           ├── AccountRepository.java
│       │   │   │   │           ├── PlayerRepository.java
│       │   │   │   │           └── EnemyRepository.java
│       │   │   │   └── resources/
│       │   │   │       ├── application.properties
│       │   │   │       ├── static/
│       │   │   │       │   ├── index.html
│       │   │   │       │   └── avatars/
│       │   │   │       │       ├── knight.png
│       │   │   │       │       ├── mage.png
│       │   │   │       │       └── archer.png
│       │   │   │       └── templates/
│       │   │   │           ├── login.html
│       │   │   │           ├── register.html
│       │   │   │           ├── accounts.html
│       │   │   │           ├── players.html
│       │   │   │           ├── enemies.html
│       │   │   │           ├── choose-character.html
│       │   │   │           ├── game.html
│       │   │   │           └── error.html
│       │   │   └── test/
│       │   │       └── java/
│       │   │           └── com/example/servingwebcontent/
│       │   │               └── ServingWebContentApplicationTest.java
│       │   ├── target/
│       │   ├── pom.xml
│       │   ├── build.gradle
│       │   └── README.md
│       └── initial/
├── REVIEW/
│   ├── Selector.java
│   ├── Sequence.java
│   └── TestSequence.java
└── img/
    ├── giaodien.png
    ├── test.png
    ├── test2.png
    ├── Untitle.png
    └── Untitled.png
```

## IV - Chức năng của từng đối tượng.

Chúng em viết 15+ class cho 4 đối tượng xác định được ở câu 2 (bao gồm main và các class hỗ trợ).

### Core Classes:
- **Account**: Quản lý thông tin tài khoản.
- **Player**: Quản lý nhân vật người chơi với các thuộc tính HP, attack, defense.
- **Enemy**: Quản lý quái vật với hệ thống combat.
- **GameController**: Điều khiển logic game.

### Repository Classes:
- **AccountRepository**: Quản lý dữ liệu tài khoản.
- **PlayerRepository**: Quản lý dữ liệu nhân vật.
- **EnemyRepository**: Quản lý dữ liệu quái vật.

### Controller Classes:
- **AccountController**: Xử lý các request liên quan đến tài khoản.
- **PlayerController**: Xử lý các request liên quan đến nhân vật.
- **EnemyController**: Xử lý các request liên quan đến quái vật.
- **GameController**: Xử lý logic game

### Support Classes:
- **aivenConnection**: Kết nối database cloud.
- **AccountAiven**: Quản lý kết nối Aiven
- **ObjectGeneral, ObjectList**: Classes hỗ trợ chung.
- **HTML Templates**: Giao diện người dùng.

## V - Kiểm nghiệm các chức năng của từng đối tượng.

### Account Testing:
- Đăng ký tài khoản, đăng nhập, hiển thị thông tin tài khoản.
- Quản lý danh sách nhân vật.
- Test cases: `testAccount.java`, `testAccountList.java`.

### Player Testing:
- Tạo nhân vật mới, hiển thị thông tin nhân vật.
- Cập nhật cấp độ, chọn nhân vật để chơi game.
- Hệ thống combat và leveling.
- Test cases: `testPlayer.java`, `testAttack.java`.

### Enemy Testing:
- Tạo quái vật mới, hiển thị thông tin quái vật.
- Cập nhật thông số quái vật và sử dụng trong game logic.
- Test cases: `testEnemy.java`.

### Game Testing:
- Khởi tạo game, chọn nhân vật.
- Xử lý logic game và cập nhật trạng thái game.
- Combat system testing.
- Test cases: `testCombat.java`.

## VI - Nội dung chính cho từng đối tượng.

### Xây dựng ứng dụng game web "Lạc Trong Rừng Cấm".

#### Yêu cầu:
- Giao diện Java Spring Boot.
- Có chức năng quản lý tài khoản, nhân vật, quái vật và game logic.
- Hệ thống combat hoàn chỉnh.
- Database integration.

#### Cụ thể:

**Quản lý tài khoản (Account):**
- Thêm, sửa, xóa tài khoản.
- Liệt kê thông tin về tài khoản.
- Đăng ký và đăng nhập hệ thống.

**Quản lý nhân vật (Player):**
- Thêm, sửa, xóa nhân vật.
- Hiển thị thông tin nhân vật.
- Cập nhật cấp độ nhân vật.
- Hệ thống combat với HP, attack, defense.
- Level up system.
- Chọn nhân vật để chơi game.

**Quản lý quái vật (Enemy):**
- Thêm, sửa, xóa quái vật.
- Hiển thị thông tin quái vật.
- Cập nhật thông số quái vật.
- Combat system với player.
- Sử dụng trong game logic.

**Quản lý game:**
- Khởi tạo game mới.
- Chọn nhân vật.
- Xử lý logic game.
- Combat system.
- Cập nhật trạng thái game.

**Database Integration:**
- Dữ liệu được lưu trữ trong MySQL Database.
- Cloud database connection (Aiven).
- JPA Repository pattern.
- Collection management (ArrayList, LinkedList, Map).

## Class Diagram

```
+---------------------+       +------------------------+        +----------------------+
|       Account       |<------>|       Player          |        |       Enemy          |
+---------------------+       +------------------------+        +----------------------+
| - id: Long          |       | - id: Long             |        | - id: Long           |
| - username: String  |       | - name: String         |        | - name: String       |
| - email: String     |       | - level: int           |        | - level: int         |
| - players: List     |       | - hp: int              |        | - hp: int            |
+---------------------+       | - maxHp: int           |        | - maxHp: int         |
| + register()        |       | - attack: int          |        | - attack: int        |
| + login()           |       | - defense: int         |        | - defense: int       |
| + showInfo()        |       | - isAlive: boolean     |        | - isAlive: boolean   |
+---------------------+       +------------------------+        +----------------------+
         |                              |                                |
         ▼                              ▼                                ▼
+---------------------+       +------------------------+        +----------------------+
|  AccountRepository  |       |   PlayerRepository     |        |   EnemyRepository    |
+---------------------+       +------------------------+        +----------------------+
| + findAll()         |       | + findAll()            |        | + findAll()          |
| + findById()        |       | + findById()           |        | + findById()         |
| + save()            |       | + save()               |        | + save()             |
| + delete()          |       | + delete()             |        | + delete()           |
+---------------------+       +------------------------+        +----------------------+
         |                              |                                |
         ▼                              ▼                                ▼
+---------------------+       +------------------------+        +----------------------+
| AccountController   |       |   PlayerController     |        |   EnemyController    |
+---------------------+       +------------------------+        +----------------------+
| + login()           |       | + createPlayer()       |        | + createEnemy()      |
| + register()        |       | + updatePlayer()       |        | + updateEnemy()      |
| + listAccounts()    |       | + deletePlayer()       |        | + deleteEnemy()      |
| + addAccount()      |       | + showPlayers()        |        | + showEnemies()      |
| + editAccount()     |       | + levelUp()            |        | + combat()           |
| + deleteAccount()   |       | + attack()             |        +----------------------+
+---------------------+       +------------------------+
         |                              |
         ▼                              ▼
+---------------------+       +------------------------+
|   GameController    |       |   ServingWebContent    |
+---------------------+       |      Application       |
| + startGame()       |       +------------------------+
| + saveGame()        |       | + main()               |
| + loadGame()        |       | + run()                |
| + updateGameStatus()|       +------------------------+
+---------------------+
```

## Activity Diagrams

### ĐĂNG NHẬP.
```
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
```

### CHỌN NHÂN VẬT.
```
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
```

### COMBAT SYSTEM.
```
┌──────────────────────────────┐
│            Start             │
└─────────────┬────────────────┘
              │
              ▼
┌──────────────────────────────┐
│   Player tấn công Enemy      │
└─────────────┬────────────────┘
              │
              ▼
┌──────────────────────────────┐
│   Tính toán damage           │
└─────────────┬────────────────┘
              │
              ▼
┌──────────────────────────────┐
│   Enemy nhận damage          │
└─────────────┬────────────────┘
              │
              ▼
┌──────────────────────────────┐
│   Enemy còn sống?            │
└───────┬─────────────┬────────┘
        │             │
     Có │             │Không
        ▼             ▼
┌────────────────┐  ┌──────────────────────────────┐
│ Enemy tấn công │  │      Player thắng!           │
│ Player         │  │      Level up!               │
└───────┬────────┘  └─────────────┬────────────────┘
        │                         │
        ▼                         ▼
┌────────────────┐        ┌───────────────┐
│ Player còn     │        │    End        │
│ sống?          │        └───────────────┘
└───────┬────────┘
        │
     Có │
        ▼
┌────────────────┐
│ Tiếp tục combat│
└─────────────┬──┘
              │
              ▼
        ┌──────────┐
        │    End   │
        └──────────┘
```

## 🎯 Hướng dẫn sử dụng:

 @ Giao diện khi chạy chương trình : 
 
 ![Screenshot 2025-07-01 003540](https://github.com/user-attachments/assets/1a06a457-3d0a-4860-9512-f2dde61440d5)

 
### 1. Đăng ký tài khoản:
- Truy cập trang chủ.
- Nhấn "Đăng Ký".
- Nhập username và email.
- Nhấn "Đăng Ký" để tạo tài khoản mới.
  
- Hình ảnh sau khi chạy chương trình :
   
![Screenshot 2025-07-01 003614](https://github.com/user-attachments/assets/5ce89841-4031-47a0-86ff-335e47faf4c4)

### 2. Đăng nhập:
- Từ trang chủ, nhấn "Đăng Nhập".
- Nhập username và password đã đăng ký.
- Nhấn "Đăng Nhập" để vào hệ thống.

-  Hình ảnh sau khi chạy chương trình :
  
  ![Screenshot 2025-07-01 003558](https://github.com/user-attachments/assets/ef59ac45-ca69-4b7b-90fb-cbeb86a17d54)


### 3. Chọn nhân vật:
- Sau khi đăng nhập, hệ thống hiển thị danh sách nhân vật.
- Chọn nhân vật để bắt đầu chơi game.
- Hình ảnh sau khi chạy chương trình :

   ![Screenshot 2025-07-01 004013](https://github.com/user-attachments/assets/dc89b281-4a64-447b-9bb1-2f6fa48bc1ef)


### 4. Combat System:
- Player và Enemy có hệ thống HP, Attack, Defense.
- Combat turn-based với damage calculation.
- Level up system khi thắng combat.
- Hình ảnh sau khi chạy chương trình :
  ![Screenshot 2025-07-01 005057](https://github.com/user-attachments/assets/dbdb33dc-7e44-48c5-aef7-c1734fd43898)


### 5. Quản lý dữ liệu:
- Quản lý tài khoản: `/accounts`.
  + Hình ảnh sau khi chạy chương trình :
![Screenshot 2025-07-01 003648](https://github.com/user-attachments/assets/32f154b9-dadd-45e0-b4c0-20d03cc8ae67)

- Quản lý nhân vật: `/players`.
  + Hình ảnh sau khi chạy chương trình :
  ![Screenshot 2025-07-01 003737](https://github.com/user-attachments/assets/853f6f27-2f1e-4aa2-821c-3311960300ce)

- Quản lý quái vật: `/enemies`.
  + Hình ảnh sau khi chạy chương trình :
![Screenshot 2025-07-01 003755](https://github.com/user-attachments/assets/f253e346-930a-47b2-883c-acffc02da3d1)

### Tài Khoản của nhà phát hành game để quản lý chương trình (admin): 
- Tài khoản :admin.
- Mật khẩu :admin123.
## 🛠️ API Endpoints.

### Account Management:
- `GET /accounts` - Danh sách tài khoản.
- `GET /accounts/add` - Form thêm tài khoản.
- `POST /accounts/add` - Thêm tài khoản.
- `GET /accounts/edit/{id}` - Form sửa tài khoản.
- `POST /accounts/edit/{id}` - Sửa tài khoản.
- `GET /accounts/delete/{id}` - Xóa tài khoản.

### Player Management:
- `GET /players` - Danh sách nhân vật.
- `GET /players/add` - Form thêm nhân vật.
- `POST /players/add` - Thêm nhân vật.
- `GET /players/edit/{id}` - Form sửa nhân vật.
- `POST /players/edit/{id}` - Sửa nhân vật.
- `GET /players/delete/{id}` - Xóa nhân vật.

### Enemy Management:
- `GET /enemies` - Danh sách quái vật.
- `GET /enemies/add` - Form thêm quái vật.
- `POST /enemies/add` - Thêm quái vật.
- `GET /enemies/edit/{id}` - Form sửa quái vật.
- `POST /enemies/edit/{id}` - Sửa quái vật.
- `GET /enemies/delete/{id}` - Xóa quái vật.

## 🗄️ Cấu trúc Database.

### Bảng accounts:
- `id` (Primary Key).
- `username` (Unique, Not Null).
- `email` (Not Null).

### Bảng players:
- `id` (Primary Key).
- `name` (Not Null).
- `level` (Integer).
- `hp` (Integer).
- `maxHp` (Integer).
- `attack` (Integer).
- `defense` (Integer).
- `isAlive` (Boolean)
- `account_id` (Foreign Key to accounts).

### Bảng enemies:
- `id` (Primary Key).
- `name` (Not Null).
- `level` (Integer).
- `hp` (Integer).
- `maxHp` (Integer).
- `attack` (Integer).
- `defense` (Integer).
- `isAlive` (Boolean).

## 🚀 Tính năng nâng cao.

### ✅ Đã triển khai:
- Hệ thống đăng ký/đăng nhập.
- Quản lý CRUD cho tài khoản, nhân vật, quái vật.
- Giao diện responsive với Spring Boot.
- Kết nối database cloud (Aiven).
- Hệ thống combat hoàn chỉnh với HP, Attack, Defense.
- Level up system.
- Turn-based combat.
- Damage calculation system.
- Player status management.

### 🔄 Có thể phát triển thêm:
- Hệ thống inventory (túi đồ).
- Hệ thống quest (nhiệm vụ).
- Hệ thống skill và magic.
- Multiplayer support.
- Real-time chat.
- Leaderboard.
- Save/Load game state.
- Different character classes.
- Equipment system.
- Hình ảnh nhân vật , quáy vật , mục tiêu .

## Phân công công việc.

| Thành viên | Nhiệm vụ |
|------------|----------|
| Đạt | Quản lý tài khoản và game logic + spingBoot + kết nối game |
| Hoài Anh | Quản lý nhân vật và combat system + báo cáo |
| Duy | Quản lý quái vật và database integration + chạy chỉnh sửa + chỉnh sửa readme |

## 🛠️ Cài đặt và chạy

### Yêu cầu hệ thống:
- Java 11+.
- Maven/Gradle.
- MySQL Database.
- Spring Boot 2.x.

### Cài đặt:
1. Clone repository.
2. Cấu hình database trong `application.properties`.
3. Chạy `mvn spring-boot:run` hoặc `./gradlew bootRun`.
4. Truy cập `http://localhost:8080`.

### Testing:
- Chạy các test cases trong thư mục `src/test/`.
- Sử dụng JUnit để kiểm tra các chức năng.

## 📝 Ghi chú.

Dự án này được phát triển theo nguyên tắc OOP với 4 đối tượng chính. Hệ thống combat được thiết kế turn-based với các thuộc tính HP, Attack, Defense. Database được tích hợp thông qua JPA Repository pattern với cloud database Aiven.
