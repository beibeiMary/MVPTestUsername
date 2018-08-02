# MVPTestUsername
Bean
  -UserBean
  用来保存用户信息
Model
  -IUserModel
  Model也需要对这三个字段进行读写操作，并存储在某个载体内(这不是我们所关心的，可以存在内存、文件、数据库或者远程服务器，但对于Presenter及View无影响),定义IUserModel接口：
  -UserModel
  实际存储操作
View
  -IUserView
  View可以对ID、FirstName、LastName这三个EditText进行读操作，对FirstName和LastName进行写操作，由此定义IUserView接口：
  -MainActivity
Presenter
  -UserPresenter   通过接口与View及Model进行交互
