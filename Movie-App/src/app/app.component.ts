import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router'; 
import { MovieListComponent } from './movie-list/movie-list.component';
import { MaterialModule } from './material.module';
import { SongListComponent } from "./song-list/song-list.component";
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, MovieListComponent, MaterialModule, SongListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Movie-App';

  }

