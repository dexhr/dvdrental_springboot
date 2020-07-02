import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountryListComponent } from './country/country-list/country-list.component';

import { HttpClientModule } from '@angular/common/http';
import { ActorListComponent } from './actor/actor-list/actor-list.component';

@NgModule({
  declarations: [
    AppComponent,
    CountryListComponent,
    ActorListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
