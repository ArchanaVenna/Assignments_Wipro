import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Song } from '../models/song.model';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '../material.module';


@Component({
  selector: 'app-song-list',
  imports: [FormsModule,CommonModule,MaterialModule],
  templateUrl: './song-list.component.html',
  styleUrl: './song-list.component.css'
})
export class SongListComponent {

  songs: Song[] = [
    { title: 'Ammadi', artist: 'Hesham Abdul Wahab', album: 'Hi Nanna', duration: '4:12', rating: 5 },
    { title: 'Kalki Anthem', artist: 'Santhosh Narayanan', album: 'Kalki 2898 AD', duration: '3:50', rating: 4 },
    { title: 'Oh Priya Priya', artist: 'Anup Rubens', album: 'Ishq ', duration: '4:12', rating: 5 },
    {  title: 'Srivalli', artist: 'Sid Sriram', album: 'Pushpa: The Rise', duration: '3:41', rating: 5 },
     { title: 'Gaaju Bhomma', artist: 'Hesham Abdul Wahab', album: 'Hi Nanna', duration: '4:12', rating: 5 },
    { title: 'Sooseki', artist: 'Shreya Ghoshal', album: 'Pushpa 2: The Rule', duration: '3:50', rating: 4 },
    { title: 'Lachhamma', artist: 'Anup Rubens', album: 'Ishq ', duration: '3:55', rating: 3 }
  ];

  filterText: string = '';

  get filteredSongs() {
    return this.songs.filter(song =>
      song.artist.toLowerCase().includes(this.filterText.toLowerCase()) ||
      song.album.toLowerCase().includes(this.filterText.toLowerCase())
    );
  }

  isTopRated(song: Song): boolean {
    return song.rating >= 4;
  }
}
