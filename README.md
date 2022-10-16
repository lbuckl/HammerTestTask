# HammerTestTask
## Приложение иммитирующее начальную страницу стандарного магазина интернет заказов
---
### О проекте:
#### - тестовое задание от Himmer System
#### - приложение отображает список данных полученных от API интернет магазина
#### - при потере связи с интернетом, отображает последние данные, сохранённые в ДБ
#### - при восстановлении связи делает повторный запрос данных
---
## :hammer_and_wrench: Испльзованы для разработки:
#### - kotlin
#### - activity + fragments
#### - MVVM (архитектура проекта)
#### - reciclerView (отображениt списка с заказами)
#### - coil (скачивание изображений полученых ссылкой из API)
#### - сollapsingToolbarLayout (поведелние элементов экрана при взаимодействии)
#### - bottomNavigationView (навигация между фрагментами)
#### - permissions: INTERNET
#### - networkStateReceiver (для контроля связи с интернет соединением)
#### - NASA API (для иммитации удалённого запроса данных)
#### - retrofit (запрос данных)
#### - SQLite, room (работа с БД хранения последних загруженных данных)
---
Демонстрация работы приложения
https://user-images.githubusercontent.com/11242192/196041430-22f9955d-aaea-4596-b441-59382cc2dccb.mp4

