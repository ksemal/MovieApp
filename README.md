# Movie app
## Details and Description
### Functionality
Movie app allows you:
* to load and see list of popular movies, tv shows and artists and corresponding descriptions from TMDB API 
* update lists of popular movies, tv shows and artists when necessary 

### App is using
* MVVM Clean Architecture:
      1. Presentation Layer:
            - View is represented by 3 activities: Movie Activity, TvShow Activity and Artist Activity
            - ViewModel for each activity call corresponding use cases (either get list or update list) and get live data of objects via repository from data source (remote, local or cached)
      2. Domain Layer:
            - Use cases: each package has 2 use cases - get list of data or update list of data
            - Repository helps communicate between view model and data source and holds logic of each use case
      3. Data Layer:
            - Remote Data Source represented by TMDBService interface to make API query to get popular movies, tv shows and artists information from API 
            - Local Data Source is represented by TMDBDatabase class and Movie, TvShow, Artist DAO objects to save, get and delete entries from local database. Entities data classes are created to hold information about movie, tv show and artist.
            - Cached Data Source is represented by corresponded ...CacheDataSourceImpl classes to save data inside a class to reduce number of calls to API and database

* Retrofit - HTTP client to prepare API call query from TMDB API
* Room persistence library to work with database
* JSON To Kotlin Class ​(JsonToKotlinClass)​ - Plugin for Kotlin to convert Json String into Kotlin data class code quickly. Used to generate entities data classes
* Coroutines to make API alls and getting database data in the background threads or UI thread on different coroutines
* Dagger - framework for dependency injection
* Data Binding to improve app performance and help prevent memory leaks and null pointer exceptions
* RecyclerView to display list of movies, tv shows and artists
* Glide is an image loading framework to add images in UI from the url

### Challenges

* Tried to implement MVVM Clean Architecture project structure for the project with pretty easy logic.
* Dependency Injection with Dagger. Dependency injection is a complex topic to digest and learn especially for beginners.

### Screenshots
