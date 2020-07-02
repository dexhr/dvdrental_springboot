import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';
import { Country } from './../../model/country';
import { CountryService } from './../../service/country.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-country-list',
  templateUrl: './country-list.component.html',
  styleUrls: ['./country-list.component.css']
})
export class CountryListComponent implements OnInit {

  countries: Observable<Country>

  constructor(private countryService: CountryService,
    private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(){
    this.countries = this.countryService.getCountriesList();
  }

}
