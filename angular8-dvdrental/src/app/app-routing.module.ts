import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CountryListComponent } from './country/country-list/country-list.component';
import { ActorListComponent } from './actor/actor-list/actor-list.component';


const routes: Routes = [
  { path: 'country-list', component: CountryListComponent },
  { path: 'actors-list', component: ActorListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
