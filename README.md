# Library Management System (Система управління бібліотекою)
## Що представляє з себе даний проект?
Проект складається з двох складових: back-end та front-end. Back-end складова представляє з RESTful API, а Front-end - клієнт, який відображує результат HTTP запитів.
## RESTful API
Грунтується на Spring MVC. Контролер "ловить" запити та викликає методи з сервісних класів, які в свою чергу взаємодіють з репозиторіями. Репозиторії взаємодіють з базою даних за допомогою POJO класів. Для цього використовується Hibernate та JpaRepository.
Авторизація реалізована за допомогою Spring Security. 
## Що планується реалізувати?
Проект має представляти з себе повноцінну систему управління бібліотекою. Користувачі розбиватимуться на дві категорії: адміністратори та відвідувачі. Відвідувачі матимуть змогу взяти книгу, повернути її, переглянути каталог книг, переглянути які книги вони вже взяли, а також написати рецензію на книгу. Також користувачі можуть додати нову книгу в бібліотеку, але для цього потрібно буде підтвердження адміністратора. Всі взаємодії користувача з бібліотекою будуть логуватися.
Адміністратор в свою чергу матиме змогу погоджувати додавання нових книг, переглядати логи та додавати нових користувачів. Також він матиме доступ до всіх функцій, якими володіє звичайний відвідувач.
