[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

# ModularizeAppAndroid
<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/MeReal-Project/ModularizeAppAndroid">
    <img src="Image/Logo MeReal.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">MeReal Concept- Modular Android App</h3>

  <p align="center">
    Android Application Experimentation, for making a complexe App ;) !
    <br />
    <a href="https://github.com/MeReal-Project/ModularizeAppAndroid"><strong>Explore the project »</strong></a>
    <br />
    ·
    <a href="https://github.com/MeReal-Project/ModularizeAppAndroid/issues">Report Bug</a>
    ·
    <a href="https://github.com/MeReal-Project/ModularizeAppAndroid/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#project-structure">Project Structure</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#clean-architecture">Clean Architecture</a></li>
    <li>
      <a href="#multi-module-architecture">Multi-Module Architecture</a>
      <ul>     
        <li><a href="#advantagedisavantage">Advantage/Disavantage</a></li>
        <li>
          <a href="#modularization-strategy">Modularization Strategy</a>
          <ul>
            <li><a href="#layer-modularization">Layer Modularization</a></li>
            <li><a href="#feature-modularization">Feature Modularization</a></li>
            <li><a href="#layered-feature-modularization">Layered-Feature Modularization</a></li>
          </ul>
        </li>
      </ul>
    </li>
    <li><a href="#mvvm">MVVM</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

![image](https://github.com/MeReal-Project/ModularizeAppAndroid/blob/20e4e2fb9b186a47f25f94e60c1011516558bf01/Image/compose.png)

There are many great README templates available on GitHub; however, I didn't find one that really suited my needs so I created this enhanced one. I want to create a README template so amazing that it'll be the last one you ever need -- I think this is it.

Here's why:
* Your time should be focused on creating something amazing. A project that solves a problem and helps others
* You shouldn't be doing the same tasks over and over like creating a README from scratch
* You should implement DRY principles to the rest of your life :smile:

Of course, no one template will serve all projects since your needs may be different. So I'll be adding more in the near future. You may also suggest changes by forking this repo and creating a pull request or opening an issue. Thanks to all the people have contributed to expanding this template!

Fork It if you want to try this project. 

<p align="right">(<a href="#top">back to top</a>)</p>



### Built With

This section summarize the library and Framework i have use for this project. 

* [Kotlin](https://kotlinlang.org/)
* [JetpackCompose](https://developer.android.com/jetpack/compose)
* [Dagger/Hilt](https://dagger.dev/hilt/)
* [Retrofit](https://square.github.io/retrofit/)
* [Coil](https://coil-kt.github.io/coil/)
* [Coroutine](https://kotlinlang.org/docs/coroutines-overview.html#sample-projects)
* [Room](https://developer.android.com/jetpack/androidx/releases/room?gclid=CjwKCAiAyPyQBhB6EiwAFUuakjQO6IsuMr2gvRX9ucrl7CsuXX68HNYztT_4OVJ1DL37qsuibNdqqBoCIhMQAvD_BwE&gclsrc=aw.ds)

<p align="right">(<a href="#top">back to top</a>)</p>

## Project Structure

The Structure of each module in the Project. 
    .
    ├── build                   # Compiled files (alternatively `dist`)
    ├── docs                    # Documentation files (alternatively `doc`)
    ├── src                     # Source files (alternatively `lib` or `app`)
    ├── test                    # Test files (alternatively `spec` or `tests`)
    │   ├── benchmarks          # Load and stress tests
    │   ├── integration         # End-to-end, integration tests (alternatively `e2e`)
    │   └── unit                # Unit tests
    └── ...

<!-- ROADMAP -->
## Roadmap
![image](Image/1_3dndBE2W_jYejuVQ9q-Jxw.png)
- [x] Multi-Module(Style Layered-Feature Modularization)
- [x] Migration Kotlin DSL
- [x] Connection with OpenFood Api [OpenFood]https://ca.openfoodfacts.org/
- [x] Add "components" document to easily copy & paste sections of the readme
- [x] End to End Test for Ui
- [x] Unit Test(learn how to Mock)
- [x] Overview Flow
- [ ] TrackerFood Flow
    - [ ] TrackerOverview Screen
       - [x] UI
       - [x] ViewModel,State
       - [ ] "Bug to fix" Don't display food item,carbs,calories and fat data on the screen
   - [ ] Search Screen
       - [x] UI
       - [x] ViewModel,State
       - [ ] "Bug to fix" Cannot display the textfield when we click on the food item    
- [ ] Multi-language Support
    - [ ] French
    - [x] English


<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Clean Architecture

Why is good to use the clean architecture concept:
1. Well-scaling apps
2. Easily testable
3. Quickly understandable for others

We need to split the base code in 3 layer(presentation,domain,data):
- Data Layer is for Database Implementation,Remote API, Mappers for DB entities and DTO(Data Transfert Object)
- Domain Layer is for UseCase(Business logic and it allow us to avoid ViewModels to being too big)
- Presentation Layer is for UI(Composable) and ViewModels

<p align="right">(<a href="#top">back to top</a>)</p>

## Multi-Module Architecture

Allow us to split the application into each module and it is very benefit for complex Application to adopt that. 

### Advantage/Disavantage

Advantage of Multi-Module:
  - Clear separation
  - Faster Gradle builds
  - dynamic feature and support for instant apps
  - Part of application are reusable
Disavantage of Multi-Module:
  - Lots of initial setup involved(build.gradle everywhere 😈)

## Modularization Strategy

It is very important to know what kind of Modularization strategy to adopt when we create an application and we are 3 options to choose

### Layer Modularization

Layer Strategy is refer to the 3 layer(Data,Domain,Presentation)
  - Big Modules => Slow Build
  - Not reusable
  - Hard to work in an isolated environement 

### Feature Modularization

Feature Strategy is refer to a single feature is the application we want to develop( exemple: DeliveryApp => Feature for Order/Feature for DashBoard User/...)
  - 1 module per feature
  - Reusable Modules
  - Limited Size 
  - Work better in isolated environement
  - No clear separation

### Layered-Feature Modularization

Layered-Feature Strategy is a mix between Feature and Layer Strategy to get the benefit for each of this strategy
  - Module by feature with layer sub-modules(ex: ShoppingData / ShoppingDomain / ShoppingPresentation)

The Stategy Who have been use in this repository is the Layered-Feature Modularization.

_For more Multi-Module examples, please refer to the [Medium Article](https://proandroiddev.com/modularization-in-android-architecture-point-of-view-from-a-to-z-part-ii-8baea5b2e4fd)_

<p align="right">(<a href="#top">back to top</a>)</p>

## MVVM

![image](Image/MVVM.png)

- Model:
    1. Contains busniss logic
    2. Contains Data source
- View:
    1. Binding with ViewModel
    2. UI(Compose)
    3. Inform the ViewModel about User Interactions
- ViewModel:
    1. Expose Data to the View
    2. ViewModel is the link between the Model and the View.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Darren Lambert - Dardevpro@outlook.com

Project Link: [https://github.com/MeReal-Project/ModularizeAppAndroid](https://github.com/MeReal-Project/ModularizeAppAndroid)

<p align="right">(<a href="#top">back to top</a>)</p>

[Best-README-Template](https://github.com/othneildrew/Best-README-Template)

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/MeReal-Project/ModularizeAppAndroid.svg?style=for-the-badge
[contributors-url]: https://github.com/MeReal-Project/ModularizeAppAndroid/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/MeReal-Project/ModularizeAppAndroid.svg?style=for-the-badge
[forks-url]: https://github.com/MeReal-Project/ModularizeAppAndroid/network/members
[stars-shield]: https://img.shields.io/github/stars/MeReal-Project/ModularizeAppAndroid.svg?style=for-the-badge
[stars-url]: https://github.com/MeReal-Project/ModularizeAppAndroid/stargazers
[issues-shield]: https://img.shields.io/github/issues/MeReal-Project/ModularizeAppAndroid.svg?style=for-the-badge
[issues-url]: https://github.com/MeReal-Project/ModularizeAppAndroid/issues
[license-shield]: https://img.shields.io/github/license/MeReal-Project/ModularizeAppAndroid.svg?style=for-the-badge
[license-url]: https://github.com/MeReal-Project/ModularizeAppAndroid/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
<!--[product-screenshot]: Image/Logo MeReal.png-->
